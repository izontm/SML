<?xml version="1.0" encoding="UTF-8"?>
<sml:SMLModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ctx="http://www.example.org/ctx" xmlns:sml="http://www.example.org/sml">
  <elements name="Fever">
    <elements xsi:type="sml:EntityParticipant" reference="//@elements.0/@elements.1">
      <isOfType href="atl_out.ctx#//@elements.2"/>
    </elements>
    <elements xsi:type="sml:AttributeReference" sourceRelation="//@elements.0/@elements.3" entity="//@elements.0/@elements.0">
      <attribute href="atl_out.ctx#//@elements.2/@attribute.0"/>
    </elements>
    <elements xsi:type="sml:Literal" targetRelation="//@elements.0/@elements.3" value="38C">
      <dataType href="atl_out.ctx#//@elements.4"/>
    </elements>
    <elements xsi:type="sml:ComparativeRelation" source="//@elements.0/@elements.1" target="//@elements.0/@elements.2">
      <relation href="example.ctx#//@elements.15"/>
    </elements>
  </elements>
  <contextModel href="atl_out.ctx#/"/>
  <primitiveContextElements xsi:type="ctx:EntityClass" name="Situation" isAbstract="true"/>
  <primitiveContextElements xsi:type="ctx:PrimitiveFormalRelation" name="after" target="//@primitiveContextElements.0" source="//@primitiveContextElements.0"/>
  <primitiveContextElements xsi:type="ctx:PrimitiveFormalRelation" name="before" target="//@primitiveContextElements.0" source="//@primitiveContextElements.0"/>
  <primitiveContextElements xsi:type="ctx:DataType" name="Time"/>
  <primitiveContextElements xsi:type="ctx:PrimitiveFormalRelation" name="within the past" target="//@primitiveContextElements.0" source="//@primitiveContextElements.3"/>
  <primitiveContextElements xsi:type="ctx:DataType" name="Duration"/>
</sml:SMLModel>
