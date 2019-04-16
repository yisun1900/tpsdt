package com.sh.tpsdt;

import com.sh.tpsdt.service.ValidateCommandService;

public class TpsdtApplication {

    public static void main(String[] args) {
        ValidateCommandService validateCommandService = new ValidateCommandService();
        validateCommandService.validateCommand();
    }
}
