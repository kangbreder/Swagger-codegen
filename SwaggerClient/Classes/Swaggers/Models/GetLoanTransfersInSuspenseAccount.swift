//
// GetLoanTransfersInSuspenseAccount.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoanTransfersInSuspenseAccount: Codable {

    public var _id: Int?
    public var name: String?
    public var glCode: Int?

    public init(_id: Int?, name: String?, glCode: Int?) {
        self._id = _id
        self.name = name
        self.glCode = glCode
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case glCode
    }


}

