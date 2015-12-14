package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBActivityIndicatorView extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBActivityIndicatorView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBActivityIndicatorView alloc();

	@Generated
	@Selector("init")
	public native MOPUBActivityIndicatorView init();

	@Generated
	@Selector("initWithCoder:")
	public native MOPUBActivityIndicatorView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MOPUBActivityIndicatorView initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("isAnimating")
	public native boolean isAnimating();

	@Generated
	@Selector("startAnimating")
	public native void startAnimating();

	@Generated
	@Selector("stopAnimating")
	public native void stopAnimating();
}