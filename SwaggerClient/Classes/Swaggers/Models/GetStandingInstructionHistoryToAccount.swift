//
// GetStandingInstructionHistoryToAccount.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetStandingInstructionHistoryToAccount: Codable {

    public var _id: Int64?
    public var accountNo: Int64?
    public var productId: Int64?
    public var productName: String?

    public init(_id: Int64?, accountNo: Int64?, productId: Int64?, productName: String?) {
        self._id = _id
        self.accountNo = accountNo
        self.productId = productId
        self.productName = productName
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case accountNo
        case productId
        case productName
    }


}

