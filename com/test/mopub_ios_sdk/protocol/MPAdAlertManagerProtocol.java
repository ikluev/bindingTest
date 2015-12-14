package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.MPAdConfiguration;
import ios.corelocation.CLLocation;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPAdAlertManagerProtocol")
public interface MPAdAlertManagerProtocol {
	@Generated
	@Selector("adConfiguration")
	MPAdConfiguration adConfiguration();

	@Generated
	@Selector("adUnitId")
	String adUnitId();

	@Generated
	@Selector("beginMonitoringAlerts")
	void beginMonitoringAlerts();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	Object delegate();

	@Generated
	@Selector("endMonitoringAlerts")
	void endMonitoringAlerts();

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("processAdAlertOnce")
	void processAdAlertOnce();

	@Generated
	@Selector("setAdConfiguration:")
	void setAdConfiguration(MPAdConfiguration value);

	@Generated
	@Selector("setAdUnitId:")
	void setAdUnitId(String value);

	@Generated
	@Selector("setDelegate:")
	void setDelegate(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setLocation:")
	void setLocation(CLLocation value);

	@Generated
	@Selector("setTargetAdView:")
	void setTargetAdView(UIView value);

	@Generated
	@Selector("targetAdView")
	UIView targetAdView();
}