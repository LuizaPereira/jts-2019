package com.luizapereira.coreengineering.tema17;

import com.luizapereira.coreengineering.tema17.commands.OperationCommand;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private static List<OperationCommand> operationCommandList = new ArrayList();

    public List<OperationCommand> getOrderList() {
        return operationCommandList;
    }

    public void addOrder(OperationCommand operationCommand) {
        this.operationCommandList.add(operationCommand);
        operationCommandList.stream().forEach(operationCommandLocal -> operationCommandLocal.executeOrder());
    }

    public void showCurrentBalance() {
        System.out.println("The current balance is R$" + calculateBalance());
    }

    private Double calculateBalance() {
        return operationCommandList.stream().mapToDouble(OperationCommand::executeOrder).sum();
    }
}
