package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
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
import com.intel.mopub_ios_sdk.protocol.MPAdAlertManagerProtocol;
import ios.NSObject;
import ios.corelocation.CLLocation;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdAlertManager extends NSObject implements
		MPAdAlertManagerProtocol {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdAlertManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adConfiguration")
	public native MPAdConfiguration adConfiguration();

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdAlertManager alloc();

	@Generated
	@Selector("beginMonitoringAlerts")
	public native void beginMonitoringAlerts();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("endMonitoringAlerts")
	public native void endMonitoringAlerts();

	@Generated
	@Selector("init")
	public native MPAdAlertManager init();

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("processAdAlertOnce")
	public native void processAdAlertOnce();

	@Generated
	@Selector("setAdConfiguration:")
	public native void setAdConfiguration(MPAdConfiguration value);

	@Generated
	@Selector("setAdUnitId:")
	public native void setAdUnitId(String value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
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
	@Selector("setLocation:")
	public native void setLocation(CLLocation value);

	@Generated
	@Selector("setTargetAdView:")
	public native void setTargetAdView_unsafe(UIView value);

	@Generated
	public void setTargetAdView(UIView value) {
		Object __old = targetAdView();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setTargetAdView_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}

	@Generated
	@Selector("targetAdView")
	public native UIView targetAdView();
}