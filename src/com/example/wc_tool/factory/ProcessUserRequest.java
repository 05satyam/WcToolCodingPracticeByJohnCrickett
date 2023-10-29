package com.example.wc_tool.factory;

/**
 * Factory implementation of incoming user request
 * This is an interface class which acepts action and file name to perfrom WC action
 */
public interface ProcessUserRequest {
    void processUserRequestWithParam(String action, String fileName) throws Exception;
}
