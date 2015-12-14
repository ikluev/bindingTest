package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.coregraphics.struct.CGPoint;
import ios.uikit.UIGestureRecognizer;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdAlertGestureRecognizer extends UIGestureRecognizer {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdAlertGestureRecognizer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdAlertGestureRecognizer alloc();

	@Generated
	@Selector("curNumZigZags")
	@NInt
	public native long curNumZigZags();

	@Generated
	@Selector("currentAlertGestureState")
	public native int currentAlertGestureState();

	@Generated
	@Selector("inflectionPoint")
	@ByValue
	public native CGPoint inflectionPoint();

	@Generated
	@Selector("init")
	public native MPAdAlertGestureRecognizer init();

	@Generated
	@Selector("initWithTarget:action:")
	public native MPAdAlertGestureRecognizer initWithTargetAction(
			@Mapped(ObjCObjectMapper.class) Object target, SEL action);

	@Generated
	@Selector("minTrackedDistanceForZigZag")
	@NFloat
	public native double minTrackedDistanceForZigZag();

	@Generated
	@Selector("numZigZagsForRecognition")
	@NInt
	public native long numZigZagsForRecognition();

	@Generated
	@Selector("setMinTrackedDistanceForZigZag:")
	public native void setMinTrackedDistanceForZigZag(@NFloat double value);

	@Generated
	@Selector("setNumZigZagsForRecognition:")
	public native void setNumZigZagsForRecognition(@NInt long value);

	@Generated
	@Selector("thresholdReached")
	public native boolean thresholdReached();
}