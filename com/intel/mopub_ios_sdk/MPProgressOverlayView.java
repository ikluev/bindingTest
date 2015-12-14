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
import com.intel.mopub_ios_sdk.protocol.MPProgressOverlayViewDelegate;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UIButton;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPProgressOverlayView extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected MPProgressOverlayView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPProgressOverlayView alloc();

	@Generated
	@Selector("closeButton")
	public native UIButton closeButton();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPProgressOverlayViewDelegate delegate();

	@Generated
	@Selector("hide")
	public native void hide();

	@Generated
	@Selector("init")
	public native MPProgressOverlayView init();

	@Generated
	@Selector("initWithCoder:")
	public native MPProgressOverlayView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithDelegate:")
	public native MPProgressOverlayView initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPProgressOverlayViewDelegate delegate);

	@Generated
	@Selector("initWithFrame:")
	public native MPProgressOverlayView initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("setCloseButton:")
	public native void setCloseButton(UIButton value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPProgressOverlayViewDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPProgressOverlayViewDelegate value) {
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

	@Generated
	@Selector("show")
	public native void show();
}