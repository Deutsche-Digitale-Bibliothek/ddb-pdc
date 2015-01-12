package de.ddb.pdc.core.answerers;

/**
 * {@inheritDoc}
 */
@SuppressWarnings("javadoc")
public enum BerneTriptisMembers {
  ALBANIA("AL"),
  ALRGERIA("DZ"),
  ANDORRA("AD"),
  ANGOLA("AO"),
  ANTIGUA_AND_BARBUDA("AG"),
  ARGENTINA("AR"),
  ARMENIA("AM"),
  AUSTRALIA("AU"),
  AUSTRIA("AT"),
  AZERBAIJAN("AZ"),
  BAHAMAS("BS"),
  BAHRAIN("BH"),
  BANGLADESH("BD"),
  BARBADOS("BB"),
  BELARUS("BY"),
  BELGIUM("BE"),
  BELIZE("BZ"),
  BENIN("BJ"),
  BHUTAN("BT"),
  BOLIVIA("BO"),
  BOSNIA_AND_HERZEGOVINA("BA"),
  BOTSWANA("BW"),
  BRAZIL("BR"),
  BRUNEI("BN"),
  BULGARIA("BG"),
  BURKINA_FASO("BF"),
  BURUNDI("BI"),
  CAMBODIA("KH"),
  CAMEROOON("CM"),
  CANADA("CA"),
  CAPE_VERDE("CV"),
  CENTRAL_AFRICAN_REPUBLIC("CF"),
  CHAD("TD"),
  CHILE("CL"),
  CHINA("CN"),
  COLOMBIA("CO"),
  COMOROS("KM"),
  CONGO("CG"),
  COSTA_RICA("CR"),
  CODE_DLVOIRE("CI"),
  CROATIA("HR"),
  CUBA("CU"),
  CYPRUS("CY"),
  CZECH_REPUBLIC("CZ"),
  DENMARK("DK"),
  DJIBOUTI("DJ"),
  DOMINICA("DM"),
  DOMINICAN_REPUBLIC("DO"),
  EAST_TIMOR("TL"),
  ECUADOR("EC"),
  EGYPT("EG"),
  EL_SAVADOR("SV"),
  EQUATORIAL_GUINEA("GQ"),
  ERITREA("ER"),
  ESTONIA("EE"),
  ETHIOPIA("ET"),
  FIJI("FJ"),
  FINLAND("FI"),
  FRANCE("FR"),
  GABON("GA"),
  GAMBIA("GM"),
  GEORGIA("GE"),
  GERMANY("DE"),
  GHANA("GH"),
  GREECE("GR"),
  GRENADA("GD"),
  GUATEMALA("GT"),
  GUINEA("GN"),
  GUINEA_BISSAU("GW"),
  GUYANA("GY"),
  HAITI("HT"),
  HONDURAS("HN"),
  HONG_KONG("HK"),
  HUNGARY("HU"),
  ICELAMD("IS"),
  INDIA("IN"),
  INDONESIA("ID"),
  IRELAND("IE"),
  ISRAEL("IL"),
  ITALY("IT"),
  JAMAICA("JM"),
  JAPAN("JP"),
  JERSEY("JE"),
  JORDAN("JO"),
  KAZAKHSTAN("KZ"),
  KENYA("KE"),
  NORTH_KOERA("KP"),
  SOUTH_KOREA("KR"),
  KUWAIT("KW"),
  KYRGYZSTAN("KG"),
  LAOS("LA"),
  LATVIA("LV"),
  LEBANON("LB"),
  LESOTHO("LS"),
  LIBERIA("LR"),
  LIBYA("LY"),
  LIECHTENSTEIN("LI"),
  LITHUANIA("LT"),
  LUXEMBOURG("LU"),
  MACAO("MO"),
  MACEDONIA("MK"),
  MADAGASCAR("MG"),
  MALAWI("MW"),
  MALAYSIA("MY"),
  MALDIVES("MV"),
  MALI("ML"),
  MALTA("MT"),
  MAURITANIA("MR"),
  MAURITIUS("MU"),
  MEXICO("MX"),
  FEDERATED_STATES_OF_MICRONESIA("FM"),
  MOLDOVA("MD"),
  MONACO("MC"),
  MONGOLIA("MN"),
  MONTENEGRO("ME"),
  MOROCCO("MA"),
  MOZAMBIQUE("MZ"),
  MYNMAR("MM"),
  NAMIBIA("NA"),
  NEPAL("NP"),
  NETHERLANDS("NL"),
  NEW_ZEALAND("NZ"),
  NICARAGUA("NI"),
  NIGER("NE"),
  NIUE("NU"),
  NIGERIA("NG"),
  NORWAY("NO"),
  OMAN("OM"),
  PAKISTAN("PK"),
  PANAMA("PA"),
  PAPUA_NEW_GUINEA("PG"),
  PARAGUAY("PY"),
  PERU("PE"),
  PHILIPPINES("PH"),
  POLAND("PL"),
  PORTUGAL("PT"),
  QATAR("AQ"),
  ROMANIA("RO"),
  RUSSIA("RU"),
  RWANDA("RW"),
  SAINT_KITTS_AND_NEVIS("KN"),
  SAINT_LUCIA("LC"),
  SAINT_VINCENT_AND_THE_GRENADINES("VC"),
  SAMOA("WS"),
  SAUDI_ARABIA("SA"),
  SEMEGAL("SN"),
  SERBIA("RS"),
  SIERRA_LEONE("SL"),
  SINGAPORE("SG"),
  SLOVAKIA("SK"),
  SLOVENIA("SI"),
  SOLOMON_ISLANDS("SB"),
  SOUTH_AFRICA("ZA"),
  SPAIN("ES"),
  SRI_LANKA("LK"),
  SUDAN("SU"),
  SURINAME("SR"),
  SWAZILAND("SZ"),
  SWEDEN("SE"),
  SWITZERLAND("CH"),
  SYRIA("SY"),
  TAIWAN("TW"),
  TAJIKSTAN("TJ"),
  TANZANIA("TZ"),
  THAILAND("TH"),
  TOGO("TG"),
  TONGA("TO"),
  TRINIDAD_AND_TOBAGO("TT"),
  TUNESIA("TN"),
  TURKEY("TR"),
  TUVALU("TV"),
  UGANDA("UG"),
  UKRAINE("UA"),
  UNITED_ARAB_EMIRATES("AE"),
  UNITED_KINGDOM("GB"),
  UNITED_STATES("US"),
  URUGUAY("UY"),
  UZBEKISTAN("UZ"),
  VANATU("VU"),
  HOLY_SEE("VA"),
  VENEZUELA("VE"),
  VIETNAM("VN"),
  YEMEN("YE"),
  ZAMBIA("ZM"),
  ZIMBABWE("ZW");

  private final String isoCode;
  
  private BerneTriptisMembers(String code) {
    this.isoCode = code;
  }
  
  /**
   * Determine whether the provided country is a member of the EEA.
   * @param country
   * @return
   */
  public static boolean isMember(String country) {
    if (country == null) {
      return false;
    }
    country = country.replaceAll("\\s+", "_"); //$NON-NLS-1$ //$NON-NLS-2$
    country = country.toUpperCase();
    try {
      EEAMembers.valueOf(country);
      return true;
    } catch (IllegalArgumentException e) {
      
      for (BerneTriptisMembers member : BerneTriptisMembers.values()) {
        if (member.isoCode.toUpperCase().equals(country.toUpperCase())) {
          return true;
        }
      }
    }
    
    return false;
  }
}
