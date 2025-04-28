/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class ReturnOrderCommand implements OrderCommand{
    private Product product;

    public ReturnOrderCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        this.product.returnOrder();
    }
    
    
}
