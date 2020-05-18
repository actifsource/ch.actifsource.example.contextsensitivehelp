package ch.actifsource.example.contextsensitivehelp.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BaseAB extends DynamicResource implements IBaseAB {

  // abstract implementation, only used for static method calls
  private BaseAB() {
    super(IBaseAB.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,17fe6a3e-945d-11ea-b3a6-d17cd8d6e816,DAv1Wz8tQu6jQ1U0HM6Ls40SYjc=] */
