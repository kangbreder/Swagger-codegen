//
// PostAccountTransfersResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostAccountTransfersResponse: Codable {

    public var savingsId: Int?
    public var resourceId: Int?

    public init(savingsId: Int?, resourceId: Int?) {
        self.savingsId = savingsId
        self.resourceId = resourceId
    }


}
