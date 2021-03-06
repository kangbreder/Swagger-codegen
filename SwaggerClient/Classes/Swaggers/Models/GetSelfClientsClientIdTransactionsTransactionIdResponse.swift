//
// GetSelfClientsClientIdTransactionsTransactionIdResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSelfClientsClientIdTransactionsTransactionIdResponse: Codable {

    public var _id: Int?
    public var officeId: Int?
    public var officeName: String?
    public var type: GetSelfClientsClientIdTransactionsType?
    public var date: Date?
    public var currency: GetSelfClientsSavingsAccountsCurrency?
    public var amount: Float?
    public var submittedOnDate: Date?
    public var reversed: Bool?

    public init(_id: Int?, officeId: Int?, officeName: String?, type: GetSelfClientsClientIdTransactionsType?, date: Date?, currency: GetSelfClientsSavingsAccountsCurrency?, amount: Float?, submittedOnDate: Date?, reversed: Bool?) {
        self._id = _id
        self.officeId = officeId
        self.officeName = officeName
        self.type = type
        self.date = date
        self.currency = currency
        self.amount = amount
        self.submittedOnDate = submittedOnDate
        self.reversed = reversed
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case officeId
        case officeName
        case type
        case date
        case currency
        case amount
        case submittedOnDate
        case reversed
    }


}

