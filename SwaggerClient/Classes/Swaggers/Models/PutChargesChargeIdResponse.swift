//
// PutChargesChargeIdResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutChargesChargeIdResponse: Codable {

    public var resourceId: Int?
    public var changes: PutChargesChargeIdRequest?

    public init(resourceId: Int?, changes: PutChargesChargeIdRequest?) {
        self.resourceId = resourceId
        self.changes = changes
    }


}

