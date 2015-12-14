package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MRCommand;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MRCommandDelegate")
public interface MRCommandDelegate {
	@Generated
	@Selector("mrCommand:createCalendarEventWithParams:")
	void mrCommandCreateCalendarEventWithParams(MRCommand command,
			NSDictionary params);

	@Generated
	@Selector("mrCommand:expandWithParams:")
	void mrCommandExpandWithParams(MRCommand command, NSDictionary params);

	@Generated
	@Selector("mrCommand:openURL:")
	void mrCommandOpenURL(MRCommand command, NSURL url);

	@Generated
	@Selector("mrCommand:playVideoWithURL:")
	void mrCommandPlayVideoWithURL(MRCommand command, NSURL url);

	@Generated
	@Selector("mrCommand:resizeWithParams:")
	void mrCommandResizeWithParams(MRCommand command, NSDictionary params);

	@Generated
	@Selector("mrCommand:setOrientationPropertiesWithForceOrientation:")
	void mrCommandSetOrientationPropertiesWithForceOrientation(
			MRCommand command, @NUInt long forceOrientation);

	@Generated
	@Selector("mrCommand:shouldUseCustomClose:")
	void mrCommandShouldUseCustomClose(MRCommand command, boolean useCustomClose);

	@Generated
	@Selector("mrCommand:storePictureWithURL:")
	void mrCommandStorePictureWithURL(MRCommand command, NSURL url);

	@Generated
	@Selector("mrCommandClose:")
	void mrCommandClose(MRCommand command);
}