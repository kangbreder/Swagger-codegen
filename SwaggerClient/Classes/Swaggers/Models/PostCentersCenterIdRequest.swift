//
// PostCentersCenterIdRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostCentersCenterIdRequest: Codable {

    public var closureReasonId: Int?
    public var closureDate: String?
    public var locale: String?
    public var dateFormat: String?

    public init(closureReasonId: Int?, closureDate: String?, locale: String?, dateFormat: String?) {
        self.closureReasonId = closureReasonId
        self.closureDate = closureDate
        self.locale = locale
        self.dateFormat = dateFormat
    }


}
