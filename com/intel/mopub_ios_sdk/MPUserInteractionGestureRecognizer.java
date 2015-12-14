package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.uikit.UIGestureRecognizer;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPUserInteractionGestureRecognizer extends UIGestureRecognizer {
	static {
		NatJ.register();
	}

	@Generated
	protected MPUserInteractionGestureRecognizer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPUserInteractionGestureRecognizer alloc();

	@Generated
	@Selector("init")
	public native MPUserInteractionGestureRecognizer init();

	@Generated
	@Selector("initWithTarget:action:")
	public native MPUserInteractionGestureRecognizer initWithTargetAction(
			@Mapped(ObjCObjectMapper.class) Object target, SEL action);
}