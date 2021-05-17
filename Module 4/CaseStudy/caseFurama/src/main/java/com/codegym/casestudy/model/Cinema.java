package com.codegym.casestudy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = " Vui lòng không để trống")
    private String title;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = " Vui lòng nhập đúng thời gian bắt đầu")
    private LocalDate timeStars;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = " Vui lòng nhập đúng thời gian kết thúc")
    private LocalDate timeEnd;

    @Min(value = 10000,message = "Mức giá phải lớn hơn 10.000 VND")
    private long price;

    @NotBlank(message = " Vui lòng không để trống")
    private String detail;


}
