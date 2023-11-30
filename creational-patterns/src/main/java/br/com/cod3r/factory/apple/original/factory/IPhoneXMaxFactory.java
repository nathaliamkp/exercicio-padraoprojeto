package br.com.cod3r.factory.apple.original.factory;

import br.com.cod3r.factory.apple.original.model.IPhone;
import br.com.cod3r.factory.apple.original.model.IPhoneXSMax;

public class IPhoneXMaxFactory extends IPhoneFactory {

        @Override
        public IPhone createIPhone() {
            return new IPhoneXSMax();
        }
}
