//
// GetAccountTransfersTemplateRefundByTransferFromAccountOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountTransfersTemplateRefundByTransferFromAccountOptions: Codable {

    public var _id: Int?
    public var accountNo: Int64?
    public var clientId: Int?
    public var clientName: String?
    public var productId: Int?
    public var productName: String?
    public var fieldOfficerId: Int?
    public var currency: GetAccountTransfersTemplateRefundByTransferCurrency?

    public init(_id: Int?, accountNo: Int64?, clientId: Int?, clientName: String?, productId: Int?, productName: String?, fieldOfficerId: Int?, currency: GetAccountTransfersTemplateRefundByTransferCurrency?) {
        self._id = _id
        self.accountNo = accountNo
        self.clientId = clientId
        self.clientName = clientName
        self.productId = productId
        self.productName = productName
        self.fieldOfficerId = fieldOfficerId
        self.currency = currency
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case accountNo
        case clientId
        case clientName
        case productId
        case productName
        case fieldOfficerId
        case currency
    }


}

