package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPNativeViewDelegate;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeView extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeView alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeViewDelegate delegate();

	@Generated
	@Selector("init")
	public native MPNativeView init();

	@Generated
	@Selector("initWithCoder:")
	public native MPNativeView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MPNativeView initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPNativeViewDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPNativeViewDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}
}