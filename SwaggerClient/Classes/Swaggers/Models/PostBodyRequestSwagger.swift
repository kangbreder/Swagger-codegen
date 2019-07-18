//
// PostBodyRequestSwagger.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostBodyRequestSwagger: Codable {

    public var officeId: Int64?
    public var firstname: String?
    public var lastname: String?
    public var externalId: String?
    public var dateFormat: String?
    public var locale: String?
    public var active: Bool?
    public var activationDate: String?
    public var submittedOnDate: String?

    public init(officeId: Int64?, firstname: String?, lastname: String?, externalId: String?, dateFormat: String?, locale: String?, active: Bool?, activationDate: String?, submittedOnDate: String?) {
        self.officeId = officeId
        self.firstname = firstname
        self.lastname = lastname
        self.externalId = externalId
        self.dateFormat = dateFormat
        self.locale = locale
        self.active = active
        self.activationDate = activationDate
        self.submittedOnDate = submittedOnDate
    }


}

