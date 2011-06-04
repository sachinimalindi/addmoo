/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.Exception;

/**
 *
 * @author A.S.Malindi
 */
public class AddmooException extends Exception{

    public AddmooException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddmooException(String message) {
        super(message);
    }


}
