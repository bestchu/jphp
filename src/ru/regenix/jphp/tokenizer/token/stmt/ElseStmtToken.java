package ru.regenix.jphp.tokenizer.token.stmt;

import ru.regenix.jphp.tokenizer.TokenType;
import ru.regenix.jphp.tokenizer.TokenMeta;

public class ElseStmtToken extends EndifStmtToken {
    public ElseStmtToken(TokenMeta meta) {
        super(meta, TokenType.T_ELSE);
    }
}
