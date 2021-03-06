//
// PostBatchesRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostBatchesRequest: Codable {

    public var requestId: Int64?
    public var relativeUrl: String?
    public var method: String?
    public var headers: [Header]?
    public var reference: Int64?
    public var body: PostBodyRequestSwagger?

    public init(requestId: Int64?, relativeUrl: String?, method: String?, headers: [Header]?, reference: Int64?, body: PostBodyRequestSwagger?) {
        self.requestId = requestId
        self.relativeUrl = relativeUrl
        self.method = method
        self.headers = headers
        self.reference = reference
        self.body = body
    }


}

