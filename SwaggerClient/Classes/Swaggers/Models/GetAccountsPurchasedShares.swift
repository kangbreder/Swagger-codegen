//
// GetAccountsPurchasedShares.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountsPurchasedShares: Codable {

    public var _id: Int?
    public var accountId: Int?
    public var purchasedDate: Date?
    public var numberOfShares: Int?
    public var purchasedPrice: Double?
    public var status: GetAccountsPurchasedSharesStatus?
    public var type: GetAccountsPurchasedSharesType?
    public var amount: Double?
    public var chargeAmount: Double?
    public var amountPaid: Double?

    public init(_id: Int?, accountId: Int?, purchasedDate: Date?, numberOfShares: Int?, purchasedPrice: Double?, status: GetAccountsPurchasedSharesStatus?, type: GetAccountsPurchasedSharesType?, amount: Double?, chargeAmount: Double?, amountPaid: Double?) {
        self._id = _id
        self.accountId = accountId
        self.purchasedDate = purchasedDate
        self.numberOfShares = numberOfShares
        self.purchasedPrice = purchasedPrice
        self.status = status
        self.type = type
        self.amount = amount
        self.chargeAmount = chargeAmount
        self.amountPaid = amountPaid
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case accountId
        case purchasedDate
        case numberOfShares
        case purchasedPrice
        case status
        case type
        case amount
        case chargeAmount
        case amountPaid
    }


}
