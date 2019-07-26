package com.luizapereira.coreengineering.tema17.commands;

import com.luizapereira.coreengineering.tema17.commands.OperationCommand;

public class DepositOperationCommand implements OperationCommand {

    private Double value;

    public DepositOperationCommand(Double value) {
        this.value = value;
    }

    @Override
    public Double executeOrder() {
        return +value;
    }

    @Override
    public String toString() {
        return "Deposit of R$ " + value;
    }
}