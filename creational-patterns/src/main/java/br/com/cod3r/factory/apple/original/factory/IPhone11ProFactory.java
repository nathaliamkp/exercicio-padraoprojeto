package br.com.cod3r.factory.apple.original.factory;

import br.com.cod3r.factory.apple.original.model.IPhone;
import br.com.cod3r.factory.apple.original.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

    @Override
    public IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
