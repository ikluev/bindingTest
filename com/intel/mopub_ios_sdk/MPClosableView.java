package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPClosableViewDelegate;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPClosableView extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected MPClosableView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPClosableView alloc();

	@Generated
	@Selector("closeButtonLocation")
	@NInt
	public native long closeButtonLocation();

	@Generated
	@Selector("closeButtonType")
	@NInt
	public native long closeButtonType();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPClosableViewDelegate delegate();

	@Generated
	@Selector("init")
	public native MPClosableView init();

	@Generated
	@Selector("initWithCoder:")
	public native MPClosableView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MPClosableView initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("initWithFrame:closeButtonType:")
	public native MPClosableView initWithFrameCloseButtonType(
			@ByValue CGRect frame, @NInt long closeButtonType);

	@Generated
	@Selector("setCloseButtonLocation:")
	public native void setCloseButtonLocation(@NInt long value);

	@Generated
	@Selector("setCloseButtonType:")
	public native void setCloseButtonType(@NInt long value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPClosableViewDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPClosableViewDelegate value) {
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
	@Selector("wasTapped")
	public native boolean wasTapped();
}