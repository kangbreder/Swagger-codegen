//
// GetClientsSavingsAccounts.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetClientsSavingsAccounts: Codable {

    public var _id: Int?
    public var accountNo: Int64?
    public var productId: Int?
    public var productName: String?
    public var status: GetClientsSavingsAccountsStatus?
    public var currency: GetClientsSavingsAccountsCurrency?

    public init(_id: Int?, accountNo: Int64?, productId: Int?, productName: String?, status: GetClientsSavingsAccountsStatus?, currency: GetClientsSavingsAccountsCurrency?) {
        self._id = _id
        self.accountNo = accountNo
        self.productId = productId
        self.productName = productName
        self.status = status
        self.currency = currency
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case accountNo
        case productId
        case productName
        case status
        case currency
    }


}

