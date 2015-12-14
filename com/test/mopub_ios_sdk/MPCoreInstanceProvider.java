package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPAdAlertManagerProtocol;
import com.test.mopub_ios_sdk.protocol.MPAdDestinationDisplayAgentDelegate;
import com.test.mopub_ios_sdk.protocol.MPAdServerCommunicatorDelegate;
import ios.NSObject;
import ios.corelocation.CLLocationManager;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSMutableURLRequest;
import ios.foundation.NSOperationQueue;
import ios.foundation.NSURL;
import ios.uikit.UIDevice;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPCoreInstanceProvider extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPCoreInstanceProvider(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPCoreInstanceProvider alloc();

	@Generated
	@Selector("buildCLLocationManager")
	public native CLLocationManager buildCLLocationManager();

	@Generated
	@Selector("buildConfiguredURLRequestWithURL:")
	public native NSMutableURLRequest buildConfiguredURLRequestWithURL(NSURL URL);

	@Generated
	@Selector("buildMPAdAlertGestureRecognizerWithTarget:action:")
	public native MPAdAlertGestureRecognizer buildMPAdAlertGestureRecognizerWithTargetAction(
			@Mapped(ObjCObjectMapper.class) Object target, SEL action);

	@Generated
	@Selector("buildMPAdAlertManagerWithDelegate:")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPAdAlertManagerProtocol buildMPAdAlertManagerWithDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("buildMPAdDestinationDisplayAgentWithDelegate:")
	public native MPAdDestinationDisplayAgent buildMPAdDestinationDisplayAgentWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPAdDestinationDisplayAgentDelegate delegate);

	@Generated
	@Selector("buildMPAdServerCommunicatorWithDelegate:")
	public native MPAdServerCommunicator buildMPAdServerCommunicatorWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPAdServerCommunicatorDelegate delegate);

	@Generated
	@Selector("buildMPTimerWithTimeInterval:target:selector:repeats:")
	public native MPTimer buildMPTimerWithTimeIntervalTargetSelectorRepeats(
			double seconds, @Mapped(ObjCObjectMapper.class) Object target,
			SEL selector, boolean repeats);

	@Generated
	@Selector("buildMPURLResolverWithURL:completion:")
	public native MPURLResolver buildMPURLResolverWithURLCompletion(
			NSURL URL,
			@ObjCBlock(name = "call_buildMPURLResolverWithURLCompletion") Block_buildMPURLResolverWithURLCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_buildMPURLResolverWithURLCompletion {
		@Generated
		void call_buildMPURLResolverWithURLCompletion(MPURLActionInfo arg0,
				NSError arg1);
	}

	@Generated
	@Selector("init")
	public native MPCoreInstanceProvider init();

	@Generated
	@Selector("keepObjectAliveForCurrentRunLoopIteration:")
	public native void keepObjectAliveForCurrentRunLoopIteration(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("sharedCarrierInfo")
	public native NSDictionary sharedCarrierInfo();

	@Generated
	@Selector("sharedCurrentDevice")
	public native UIDevice sharedCurrentDevice();

	@Generated
	@Selector("sharedLogEventRecorder")
	public native MPLogEventRecorder sharedLogEventRecorder();

	@Generated
	@Selector("sharedMPAnalyticsTracker")
	public native MPAnalyticsTracker sharedMPAnalyticsTracker();

	@Generated
	@Selector("sharedMPGeolocationProvider")
	public native MPGeolocationProvider sharedMPGeolocationProvider();

	@Generated
	@Selector("sharedMPReachability")
	public native MPReachability sharedMPReachability();

	@Generated
	@Selector("sharedNetworkManager")
	public native MPNetworkManager sharedNetworkManager();

	@Generated
	@Selector("sharedOperationQueue")
	public native NSOperationQueue sharedOperationQueue();

	@Generated
	@Selector("sharedProvider")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedProvider();

	@Generated
	@Selector("singletonForClass:provider:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object singletonForClassProvider(
			Class klass,
			@ObjCBlock(name = "call_singletonForClassProvider") Block_singletonForClassProvider provider);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_singletonForClassProvider {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		Object call_singletonForClassProvider();
	}
}