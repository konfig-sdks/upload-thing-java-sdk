package com.konfigthis.client;

import com.konfigthis.client.api.CallbackApi;
import com.konfigthis.client.api.FileApi;
import com.konfigthis.client.api.MultipartApi;
import com.konfigthis.client.api.ServerCallbackApi;
import com.konfigthis.client.api.UploadApi;
import com.konfigthis.client.api.UsageInfoApi;

public class UploadThing {
    private ApiClient apiClient;
    public final CallbackApi callback;
    public final FileApi file;
    public final MultipartApi multipart;
    public final ServerCallbackApi serverCallback;
    public final UploadApi upload;
    public final UsageInfoApi usageInfo;

    public UploadThing() {
        this(null);
    }

    public UploadThing(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.callback = new CallbackApi(this.apiClient);
        this.file = new FileApi(this.apiClient);
        this.multipart = new MultipartApi(this.apiClient);
        this.serverCallback = new ServerCallbackApi(this.apiClient);
        this.upload = new UploadApi(this.apiClient);
        this.usageInfo = new UsageInfoApi(this.apiClient);
    }

}
