class Book {
    constructor(code, name, year, qty) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.qty = qty;
    }
    getCode(){
        return this.code
    }
    getName(){
        return this.name
    }
    getYear(){
        return this.year
    }
    getQty(){
        return this.qty
    }
    getStatus(){
        if (this.getQty() > 0){
            return true
        } else {
            return false
        }
    }
}
class BookProgram {
    constructor(list) {
        this.list = new Array()
    }
    bookList(){
        let bookTable = "<h2>Quản lý sách</h2>" +
        "<table>" +
        "<tr>" +
        "<th>Mã số sách</th>"+
        "<th>Tên sách</th>"+
        "<th>Năm xuất bản</th>"+
        "<th>Số quyển</th>"+
        "<th>Tình trạng</th>"+
         "</tr>";
        if (this.list.length > 0){
            for (let i = 0; i < this.list.length; i++){
                bookTable += "<tr>" +
                "<td>" + this.list[i].getCode() +" </td>"+
                "<td>" + this.list[i].getName() +" </td>"+
                "<td>" + this.list[i].getYear() +" </td>"+
                "<td>" + this.list[i].getQty() +" </td>"+
                "<td>" + this.list[i].getStatus() +" </td>"+
                 "</tr>"
            }
        }
         bookTable += "</table>";
         document.getElementById("showInfo").innerHTML = bookTable
    }
    buttonDiv(){
        let buttonList = "<p><button>Thêm sách đã có</button>"+
        "<button onclick='addBook()'>Thêm sách mới</button>"+
        "<button>Mượn sách</button>"+
        "<button>Hiển thị sách nhiều nhất</button></p>";
        document.getElementById("buttonDiv").innerHTML = buttonList
    }
    checkBookCode(code){
        //Kiểm tra mã sách nhập vào đã có trong thư viện chưa
        //Thủ tục này ngoài yêu cầu đề bài. Nếu không sử dụng thì xóa luôn ở điều kiện while dòng 81
        if (this.list.length > 0){
            for (let i = 0; i < this.list.length; i++){
                if (this.list[i].getCode() === code){
                    return false
                }
            }
            return true
        }
        return true
    }
    addNewBook(){
        let code;
        let name = "";
        let year;
        let qty;
        while (!Number.isInteger(parseFloat(code)) || code.length !==5 || parseFloat(code) < 10000 || parseFloat(code) > 59999 || !this.checkBookCode(code)){
            code = prompt("Nhập mã sách\nĐỊnh dạng: ABBBB (A: 1-5, B:0-9)\nKhông trùng với mã sách đã có trong hệ thống")
        }
        while (name === ""){
            name = prompt("Nhập tên sách")
        }
        while (!Number.isInteger(year) || year < 1000 || year > 9999){
            year = parseFloat(prompt("Nhập năm xuất bản\nĐỊnh dạng: 4 chữ số"))
        }
        while (!Number.isInteger(qty) || qty <= 0){
            qty = parseFloat(prompt("Nhập số lượng sách\n Định dạng: Số nguyên > 0"))
        }
        let newBook = new Book(code, name, year, qty);
        this.list.push(newBook);
        alert("Nhập thành công")
        this.bookList();
        this.buttonDiv()
    }

}
let  listOfBook = new Array();
let bookManagement = new BookProgram(listOfBook);
function addBook() {
    bookManagement.addNewBook()
}
function main() {
    bookManagement.bookList();
    bookManagement.buttonDiv()
}