package service.CalculatorServiceImpl;

import org.springframework.stereotype.Service;
import service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Long calculator(Long num1, Long num2, String cal) throws Exception {
        switch (cal) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new Exception("Không thể chia cho 0");
                } else {
                    return num1 / num2;
                }
        }
        return null;
    }
}
