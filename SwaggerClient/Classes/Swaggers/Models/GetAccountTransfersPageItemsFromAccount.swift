//
// GetAccountTransfersPageItemsFromAccount.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountTransfersPageItemsFromAccount: Codable {

    public var _id: Int?
    public var accountNo: Int64?

    public init(_id: Int?, accountNo: Int64?) {
        self._id = _id
        self.accountNo = accountNo
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case accountNo
    }


}

