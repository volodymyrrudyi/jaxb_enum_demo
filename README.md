jaxb_enum_demo
==============

This demo shows how to unmarshal EnumSet using JAXB. Let's
say we have User object that have some access permissions - 
for writing, reading and executing files. User can have several
permissions at the same time, so they are stored in the EnumSet.

We need to unmarshal this object from XML and we know that our XML file will
look like:

<User>
 <AccessMask>
  <AccessBit Name="Read" />
  <AccessBit Name="Execute />
 </AccessMask>
</User>

So it's not the format which is expected by JAXB by default, that's
why we need to use several adapters to achieve our goal.
