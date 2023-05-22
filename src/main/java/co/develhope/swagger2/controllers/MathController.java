package co.develhope.swagger2.controllers;
import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/")
    public String welcomeMathMsg(){
        return "math section";
    }
    @GetMapping("/division-info")
    public ArithmeticOperation getDivisionInfo(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.setName("division");
        arithmeticOperation.setNumberOfOperands(2);
        arithmeticOperation.setProperties(new String[]{"Dividend", "Divisor", "Quotient", "Remainder"});
        return arithmeticOperation;
    }
    @GetMapping("/multiplication")
    public Integer getMultiplication(@RequestParam Integer multiplier, @RequestParam Integer multiplicand){
        return multiplier * multiplicand;
    }
    @GetMapping("/square/{n}")
    public Integer getSquare(@PathVariable Integer n){
        return n * n;
    }
}