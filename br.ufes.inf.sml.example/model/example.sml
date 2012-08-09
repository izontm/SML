<?xml version="1.0" encoding="UTF-8"?>
<sml:SMLModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ctx="http://www.example.org/ctx" xmlns:sml="http://www.example.org/sml">
  <elements name="LoggedIn">
    <parameter nodeReference="//@elements.0/@elements.3" name="device"/>
    <parameter nodeReference="//@elements.0/@elements.0" name="account"/>
    <elements xsi:type="sml:EntityParticipant" nodeParameter="//@elements.0/@parameter.1">
      <isOfType href="example.ctx#//@elements.7"/>
    </elements>
    <elements xsi:type="sml:RelatorParticipant" links="//@elements.0/@elements.2 //@elements.0/@elements.4">
      <isOfType href="example.ctx#//@elements.9"/>
    </elements>
    <elements xsi:type="sml:Link" entity="//@elements.0/@elements.0" relator="//@elements.0/@elements.1">
      <isOfType href="example.ctx#//@elements.10"/>
    </elements>
    <elements xsi:type="sml:EntityParticipant" nodeParameter="//@elements.0/@parameter.0">
      <isOfType href="example.ctx#//@elements.1"/>
    </elements>
    <elements xsi:type="sml:Link" entity="//@elements.0/@elements.3" relator="//@elements.0/@elements.1">
      <isOfType href="example.ctx#//@elements.13"/>
    </elements>
  </elements>
  <elements name="OngoingSuspiciousWithdrawal">
    <elements xsi:type="sml:EntityParticipant">
      <isOfType href="example.ctx#//@elements.7"/>
    </elements>
    <elements xsi:type="sml:EntityParticipant">
      <isOfType href="example.ctx#//@elements.3"/>
    </elements>
    <elements xsi:type="sml:RelatorParticipant" reference="//@elements.1/@elements.5" links="//@elements.1/@elements.3 //@elements.1/@elements.4">
      <isOfType href="example.ctx#//@elements.8"/>
    </elements>
    <elements xsi:type="sml:Link" entity="//@elements.1/@elements.0" relator="//@elements.1/@elements.2">
      <isOfType href="example.ctx#//@elements.11"/>
    </elements>
    <elements xsi:type="sml:Link" entity="//@elements.1/@elements.1" relator="//@elements.1/@elements.2">
      <isOfType href="example.ctx#//@elements.12"/>
    </elements>
    <elements xsi:type="sml:AttributeReference" sourceRelation="//@elements.1/@elements.7" entity="//@elements.1/@elements.2">
      <attribute href="example.ctx#//@elements.8/@attribute.0"/>
    </elements>
    <elements xsi:type="sml:Literal" targetRelation="//@elements.1/@elements.7" value="$1000">
      <dataType href="example.ctx#//@elements.21"/>
    </elements>
    <elements xsi:type="sml:ComparativeRelation" parameter="" source="//@elements.1/@elements.5" target="//@elements.1/@elements.6">
      <relation href="example.ctx#//@elements.15"/>
    </elements>
  </elements>
  <elements name="SuspiciousParallelLogin">
    <elements xsi:type="sml:SituationParticipant" situationType="//@elements.0" parameter="//@elements.2/@elements.2"/>
    <elements xsi:type="sml:SituationParticipant" situationType="//@elements.0" parameter="//@elements.2/@elements.3"/>
    <elements xsi:type="sml:SituationParameterReference" sourceRelation="//@elements.2/@elements.4" parameter="//@elements.0/@parameter.1" situation="//@elements.2/@elements.0"/>
    <elements xsi:type="sml:SituationParameterReference" targetRelation="//@elements.2/@elements.4" parameter="//@elements.0/@parameter.1" situation="//@elements.2/@elements.1"/>
    <elements xsi:type="sml:ComparativeRelation" source="//@elements.2/@elements.2" target="//@elements.2/@elements.3">
      <relation href="example.ctx#//@elements.14"/>
    </elements>
    <elements xsi:type="sml:TemporalOperatorExpression" source="//@elements.2/@elements.0" target="//@elements.2/@elements.1" operator="overlaps"/>
  </elements>
  <elements name="SuspiciousFarawayLogin">
    <elements xsi:type="sml:SituationParticipant" situationType="//@elements.0" parameter="//@elements.3/@elements.4 //@elements.3/@elements.7"/>
    <elements xsi:type="sml:SituationParticipant" situationType="//@elements.0" parameter="//@elements.3/@elements.3 //@elements.3/@elements.6" isPast="true"/>
    <elements xsi:type="sml:TemporalOperatorExpression" parameter="0s, 2s" source="//@elements.3/@elements.1" target="//@elements.3/@elements.0" operator="before"/>
    <elements xsi:type="sml:SituationParameterReference" sourceRelation="//@elements.3/@elements.5" parameter="//@elements.0/@parameter.1" situation="//@elements.3/@elements.1"/>
    <elements xsi:type="sml:SituationParameterReference" targetRelation="//@elements.3/@elements.5" parameter="//@elements.0/@parameter.1" situation="//@elements.3/@elements.0"/>
    <elements xsi:type="sml:ComparativeRelation" parameter="" source="//@elements.3/@elements.3" target="//@elements.3/@elements.4">
      <relation href="example.ctx#//@elements.14"/>
    </elements>
    <elements xsi:type="sml:SituationParameterReference" sourceRelation="//@elements.3/@elements.12" parameter="//@elements.0/@parameter.0" situation="//@elements.3/@elements.1"/>
    <elements xsi:type="sml:SituationParameterReference" sourceRelation="//@elements.3/@elements.13" parameter="//@elements.0/@parameter.0" situation="//@elements.3/@elements.0"/>
    <elements xsi:type="sml:EntityParticipant" targetRelation="//@elements.3/@elements.12" reference="//@elements.3/@elements.10">
      <isOfType href="example.ctx#//@elements.1"/>
    </elements>
    <elements xsi:type="sml:EntityParticipant" targetRelation="//@elements.3/@elements.13" reference="//@elements.3/@elements.11">
      <isOfType href="example.ctx#//@elements.1"/>
    </elements>
    <elements xsi:type="sml:AttributeReference" sourceRelation="//@elements.3/@elements.14" entity="//@elements.3/@elements.8">
      <attribute href="example.ctx#//@elements.0/@attribute.0"/>
    </elements>
    <elements xsi:type="sml:AttributeReference" targetRelation="//@elements.3/@elements.14" entity="//@elements.3/@elements.9">
      <attribute href="example.ctx#//@elements.0/@attribute.0"/>
    </elements>
    <elements xsi:type="sml:ComparativeRelation" parameter="" source="//@elements.3/@elements.6" target="//@elements.3/@elements.8">
      <relation href="example.ctx#//@elements.14"/>
    </elements>
    <elements xsi:type="sml:ComparativeRelation" source="//@elements.3/@elements.7" target="//@elements.3/@elements.9">
      <relation href="example.ctx#//@elements.14"/>
    </elements>
    <elements xsi:type="sml:ComparativeRelation" parameter="500km" isNegated="true" source="//@elements.3/@elements.10" target="//@elements.3/@elements.11">
      <relation href="example.ctx#//@elements.19"/>
    </elements>
  </elements>
  <elements name="AccountUnderObservation">
    <parameter nodeReference="//@elements.4/@elements.2" name="account"/>
    <elements xsi:type="sml:ExistsSituation" situationType="//@elements.1" parameter="//@elements.4/@elements.1" isPast="true"/>
    <elements xsi:type="sml:SituationParameterReference" sourceRelation="//@elements.4/@elements.3" parameter="//@elements.0/@parameter.1" situation="//@elements.4/@elements.0"/>
    <elements xsi:type="sml:EntityParticipant" nodeParameter="//@elements.4/@parameter.0" targetRelation="//@elements.4/@elements.3">
      <isOfType href="example.ctx#//@elements.7"/>
    </elements>
    <elements xsi:type="sml:ComparativeRelation" source="//@elements.4/@elements.1" target="//@elements.4/@elements.2">
      <relation href="example.ctx#//@elements.14"/>
    </elements>
    <elements xsi:type="sml:Literal" value="30 days"/>
  </elements>
  <elements name="AnyAccountUnderObservation">
    <elements xsi:type="sml:ExistsSituation" situationType="//@elements.1" isPast="true"/>
    <elements xsi:type="sml:Literal" value="30 days"/>
  </elements>
  <contextModel href="example.ctx#/"/>
  <primitiveContextElements xsi:type="ctx:EntityClass" name="Situation" isAbstract="true"/>
  <primitiveContextElements xsi:type="ctx:PrimitiveFormalRelation" name="after" target="//@primitiveContextElements.0" source="//@primitiveContextElements.0"/>
  <primitiveContextElements xsi:type="ctx:PrimitiveFormalRelation" name="before" target="//@primitiveContextElements.0" source="//@primitiveContextElements.0"/>
  <primitiveContextElements xsi:type="ctx:DataType" name="Time"/>
  <primitiveContextElements xsi:type="ctx:PrimitiveFormalRelation" name="within the past" target="//@primitiveContextElements.3" source="//@primitiveContextElements.3"/>
  <primitiveContextElements xsi:type="ctx:DataType" name="Duration"/>
</sml:SMLModel>
