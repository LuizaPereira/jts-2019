package com.luizapereira.coreengineering.tema17.commands;

import com.luizapereira.coreengineering.tema17.commands.OperationCommand;

public class WithdrawalOperationCommand implements OperationCommand {

    private Double value;

    public WithdrawalOperationCommand(Double value) {
        this.value = value;
    }

    @Override
    public Double executeOrder() {
        return -value;
    }

    @Override
    public String toString() {
        return "Withdrawal of R$ " + value;
    }
}