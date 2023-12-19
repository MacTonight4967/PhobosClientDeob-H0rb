package org.spongepowered.tools.obfuscation.service;

import java.util.Collection;
import java.util.Set;

public interface IObfuscationService {
  Set<String> getSupportedOptions();
  
  Collection<ObfuscationTypeDescriptor> getObfuscationTypes();
}


/* Location:              C:\Users\deadc\Downloads\CLEAN_Phobos-1.9.0-Compatible_By_H0rb.jar!\org\spongepowered\tools\obfuscation\service\IObfuscationService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.0
 */