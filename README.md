SML
===

Situation Modeling and Rule-Based Situation Detection

This project provides a set of eclipse plugins for specification and realization of situation models in SML:

* SML metamodel project and eclipse tree editor:
  * br.ufes.inf.sml
  * br.ufes.inf.sml.edit
  * br.ufes.inf.sml.editor

* Context metamodel project and eclipse tree editor:
  * br.ufes.inf.ctx
  * br.ufes.inf.ctx.edit
  * br.ufes.inf.ctx.editor

* Transformation from UML models to Context models used by SML:
  * br.ufes.inf.uml2ctx
  * br.ufes.inf.uml2ctx.ui

* Tranformation from SML models to [JBoss Drools](http://www.jboss.org/drools/ "Drools") and Java code using [Acceleo](http://www.eclipse.org/acceleo/ "Acceleo"):
  * br.inf.ufes.sml.generate

* SML graphical editor designed with [Obeo Designer](http://www.obeodesigner.com/ "Obeo Designer"):
  * br.inf.ufes.sml.design

* SML example project and generated code:
  * br.inf.ufes.example

This project will only provide the source code of Eclipse plugins. In order to run the editor or the transformation, you must export the plugins related to SML (br.ufes.inf.ctx.editor and br.ufes.inf.sml.editor), or run these projects as an Eclipse application.