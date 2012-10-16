package com.rvcode.demos.jaxb.enums;
import java.util.EnumSet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlRootElement(name = "User")
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	@XmlElement(name = "AccessMask")
	@XmlJavaTypeAdapter(AccessMaskAdapter.class)
	EnumSet<AccessBit> acessMask;
}
