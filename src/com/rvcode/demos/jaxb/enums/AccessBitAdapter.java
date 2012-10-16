package com.rvcode.demos.jaxb.enums;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlAdapter;


public class AccessBitAdapter extends XmlAdapter<AccessBitAdapter.AccessBitWrapper, AccessBit>{
	
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class AccessBitWrapper{
		@XmlAttribute(name = "Name")
		String name;
	}

	@Override
	public AccessBitWrapper marshal(AccessBit v) throws Exception {
		AccessBitWrapper w = new AccessBitWrapper();
		w.name = v.toString();
		return w;
	}

	@Override
	public AccessBit unmarshal(AccessBitWrapper v) throws Exception {
		return AccessBit.valueOf(v.name);
	}
}
