/**
 * Copyright (c) 2026 V K Deewakar. All Rights Reserved.
 */
package com.assignment.Assets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This is CategoryNotPresentException class.
 * @author V K Deewakar
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CategoryNotPresentException extends RuntimeException {

    public CategoryNotPresentException(String exception) {
        super(exception);
    }
}
