package br.com.cod3r.factory.apple.original.factory;


import br.com.cod3r.factory.apple.original.model.IPhone;
import br.com.cod3r.factory.apple.original.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{

    @Override
    public IPhone createIPhone() {
        return new IPhoneX();
    }
}
