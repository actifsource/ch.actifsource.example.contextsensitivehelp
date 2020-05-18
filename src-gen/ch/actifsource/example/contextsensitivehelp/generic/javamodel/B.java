package ch.actifsource.example.contextsensitivehelp.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class B extends DynamicResource implements IB {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IB> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IB>() {
    
    @Override
    public IB create() {
      return new B();
    }
    
    @Override
    public IB create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new B(resourceRepository, resource);
    }
  
  };

  public B() {
    super(IB.TYPE_ID);
  }
  
  public B(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IB.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public B setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,17fe6a3d-945d-11ea-b3a6-d17cd8d6e816,Bddg0L3aNEzHmsnew59MdO28ABw=] */
