package com.luizapereira.coreengineering.tema17;

import com.luizapereira.coreengineering.tema17.commands.DepositOperationCommand;
import com.luizapereira.coreengineering.tema17.commands.WithdrawalOperationCommand;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();
        broker.addOrder(new DepositOperationCommand(800.00));
        broker.addOrder(new WithdrawalOperationCommand(50.00));
        broker.addOrder(new WithdrawalOperationCommand(30.00));

        System.out.println("History of transactions: ");
        broker.getOrderList().forEach(order -> System.out.println(order.toString()));

        broker.showCurrentBalance();
    }
}