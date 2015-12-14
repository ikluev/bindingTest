package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.corelocation.CLLocation;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPGeolocationProvider extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPGeolocationProvider(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPGeolocationProvider alloc();

	@Generated
	@Selector("init")
	public native MPGeolocationProvider init();

	@Generated
	@Selector("lastKnownLocation")
	public native CLLocation lastKnownLocation();

	@Generated
	@Selector("locationUpdatesEnabled")
	public native boolean locationUpdatesEnabled();

	@Generated
	@Selector("setLocationUpdatesEnabled:")
	public native void setLocationUpdatesEnabled(boolean value);

	@Generated
	@Selector("sharedProvider")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedProvider();
}