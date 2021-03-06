package io.github.androidhot.designpattern.abstractfactory.java;

public class AndroidControllerFactory implements ControllerFactory {
    @Override public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }


    @Override public OperationController createOperationController() {
        return new AndroidOperationController();
    }
}
