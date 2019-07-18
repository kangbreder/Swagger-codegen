//
// GetAccountsPageItems.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountsPageItems: Codable {

    public var _id: Int?
    public var accountNo: Int64?
    public var clientId: Int?
    public var clientName: String?
    public var productId: Int?
    public var productName: String?
    public var status: GetAccountsTypeStatus?
    public var timeline: GetAccountsTypeTimeline?
    public var currency: GetAccountsChargesCurrency?
    public var purchasedShares: [GetAccountsTypePurchasedShares]?
    public var summary: GetAccountsTypeSummary?

    public init(_id: Int?, accountNo: Int64?, clientId: Int?, clientName: String?, productId: Int?, productName: String?, status: GetAccountsTypeStatus?, timeline: GetAccountsTypeTimeline?, currency: GetAccountsChargesCurrency?, purchasedShares: [GetAccountsTypePurchasedShares]?, summary: GetAccountsTypeSummary?) {
        self._id = _id
        self.accountNo = accountNo
        self.clientId = clientId
        self.clientName = clientName
        self.productId = productId
        self.productName = productName
        self.status = status
        self.timeline = timeline
        self.currency = currency
        self.purchasedShares = purchasedShares
        self.summary = summary
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case accountNo
        case clientId
        case clientName
        case productId
        case productName
        case status
        case timeline
        case currency
        case purchasedShares
        case summary
    }


}

