/* The following code was generated by JFlex 1.3.5 on 6/7/19 8:33 PM */

package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 6/7/19 8:33 PM from the specification file
 * <tt>file:/D:/workspace/project_compiler_98/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\1\20\1\17\1\0\1\20\1\16\22\0\1\20\1\52\1\46"+
    "\1\21\1\0\1\55\1\53\1\0\1\3\1\4\1\50\1\22\1\11"+
    "\1\13\1\12\1\54\1\24\11\23\1\1\1\2\1\51\1\15\1\14"+
    "\2\0\4\27\1\32\14\27\1\30\10\27\1\7\1\0\1\10\1\47"+
    "\1\45\1\0\1\43\1\42\1\45\1\62\1\31\1\34\1\60\1\41"+
    "\1\33\1\45\1\44\1\35\1\45\1\56\1\37\1\64\1\45\1\25"+
    "\1\36\1\57\1\61\1\45\1\40\1\45\1\63\1\45\1\5\1\26"+
    "\1\6\1\0\uff81\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    53,   106,   159,   106,   106,   106,   106,   106,   106, 
      106,   106,   106,   212,   265,   318,   371,   106,   424,   477, 
      530,   583,   636,   689,   742,   795,   848,   901,   954,  1007, 
     1060,  1113,  1166,  1219,  1272,  1325,  1378,  1431,  1484,  1537, 
     1590,  1643,   106,   106,   106,   106,   106,  1696,   583,  1749, 
      106,   106,   424,   106,   106,  1802,  1855,  1908,  1961,  2014, 
     2067,   106,  2120,  2173,  2226,   742,  2279,  2332,  2385,  2438, 
     2491,  2544,  2597,  1166,   106,   106,   106,   106,   106,  2650, 
      106,   106,   106,   106,   106,  2703,  2756,  2809,   106,  1802, 
     1908,  2862,   106,  2915,  2968,  3021,  3074,  3127,   742,   742, 
     3180,   742,  3233,  3286,   742,   106,   742,  3339,   742,  3392, 
     3445,   742,  3498,   742,  3551,  3604,  3657,  3710,  3763,  3816, 
      742,   742,   742,   742,   742
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\2\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\2\31\1\32"+
    "\1\31\1\33\1\34\1\31\1\35\1\31\1\36\1\31"+
    "\1\37\1\40\2\31\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\5\31\1\52\65\3\66\0"+
    "\1\53\13\0\1\54\62\0\1\55\1\56\1\57\5\0"+
    "\1\60\1\61\54\0\1\62\1\63\64\0\1\64\66\0"+
    "\1\22\45\0\16\65\1\21\1\22\45\65\15\0\1\66"+
    "\4\0\1\67\1\60\1\61\52\0\1\70\10\0\1\25"+
    "\1\71\1\72\1\73\1\0\1\72\2\74\44\0\1\70"+
    "\10\0\2\61\63\0\6\31\1\75\14\31\10\0\7\31"+
    "\15\0\1\76\5\0\1\77\1\100\21\31\10\0\7\31"+
    "\23\0\23\31\10\0\7\31\23\0\12\31\1\101\10\31"+
    "\10\0\7\31\23\0\11\31\1\102\11\31\10\0\1\103"+
    "\6\31\23\0\14\31\1\104\6\31\10\0\7\31\23\0"+
    "\23\31\10\0\1\31\1\105\3\31\1\106\1\31\23\0"+
    "\16\31\1\107\4\31\10\0\7\31\23\0\2\31\1\110"+
    "\20\31\10\0\7\31\23\0\23\31\10\0\4\31\1\111"+
    "\2\31\46\112\1\113\16\112\15\0\1\114\64\0\1\115"+
    "\32\0\1\116\31\0\1\117\33\0\1\120\30\0\1\121"+
    "\64\0\1\122\35\0\1\123\26\0\1\124\64\0\1\125"+
    "\72\0\10\31\1\126\12\31\10\0\7\31\23\0\2\31"+
    "\1\127\20\31\10\0\7\31\12\0\1\70\10\0\1\60"+
    "\1\130\1\0\1\74\2\0\2\74\47\0\1\131\72\0"+
    "\2\132\52\0\1\70\10\0\2\71\2\72\1\0\1\72"+
    "\57\0\2\133\1\0\3\133\1\0\1\133\45\0\1\134"+
    "\6\0\1\134\2\133\1\0\3\133\1\0\1\133\45\0"+
    "\1\134\6\0\1\134\1\132\1\135\1\0\1\134\61\0"+
    "\20\31\1\136\2\31\10\0\1\31\1\137\5\31\12\0"+
    "\1\70\10\0\1\77\1\140\1\31\1\141\2\31\2\141"+
    "\13\31\10\0\7\31\12\0\1\70\10\0\2\100\21\31"+
    "\10\0\7\31\23\0\13\31\1\142\7\31\10\0\7\31"+
    "\23\0\23\31\10\0\1\31\1\143\5\31\23\0\2\31"+
    "\1\144\20\31\10\0\7\31\23\0\2\31\1\145\20\31"+
    "\10\0\7\31\23\0\13\31\1\146\7\31\10\0\7\31"+
    "\23\0\10\31\1\147\12\31\10\0\7\31\23\0\6\31"+
    "\1\150\14\31\10\0\7\31\23\0\23\31\10\0\1\31"+
    "\1\151\5\31\15\0\1\152\72\0\12\31\1\153\10\31"+
    "\10\0\7\31\23\0\10\31\1\154\12\31\10\0\7\31"+
    "\12\0\1\70\10\0\2\130\63\0\1\132\64\0\12\31"+
    "\1\155\10\31\10\0\7\31\23\0\23\31\10\0\3\31"+
    "\1\156\3\31\12\0\1\70\10\0\2\140\21\31\10\0"+
    "\7\31\13\0\1\134\6\0\1\134\1\157\1\160\1\31"+
    "\1\161\17\31\10\0\7\31\23\0\6\31\1\162\14\31"+
    "\10\0\7\31\23\0\10\31\1\163\12\31\10\0\7\31"+
    "\23\0\12\31\1\164\10\31\10\0\7\31\23\0\20\31"+
    "\1\165\2\31\10\0\7\31\23\0\23\31\10\0\1\166"+
    "\6\31\23\0\2\31\1\167\20\31\10\0\7\31\23\0"+
    "\2\157\21\31\10\0\7\31\23\0\1\157\22\31\10\0"+
    "\7\31\23\0\23\31\10\0\1\170\6\31\23\0\6\31"+
    "\1\171\14\31\10\0\7\31\23\0\21\31\1\172\1\31"+
    "\10\0\7\31\23\0\23\31\10\0\1\31\1\173\5\31"+
    "\23\0\23\31\10\0\1\174\6\31\23\0\23\31\10\0"+
    "\2\31\1\175\4\31";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  1,  9,  9,  9,  9,  9,  9,  9,  9,  9,  1,  1,  1, 
     1,  9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  9,  9,  9,  9,  9,  1, 
     0,  1,  9,  9,  0,  9,  9,  0,  1,  0,  0,  0,  1,  9,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  9,  9,  9,  9,  9,  1, 
     9,  9,  9,  9,  9,  1,  1,  1,  9,  1,  1,  0,  9,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  9,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
		return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    public int toDecimalNumber(String s){
    	String[] num = s.split("r");
		int base = Integer.parseInt(num[0]);
		int number = Integer.parseInt(num[1]);
		int output = 0;
		for(int i=0; i<num[1].length(); i++){
			output += Math.pow(base,num[1].length()-1);
		}
		return output;
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[3869];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 65: 
          {  return symbolFactory.newSymbol("if",IF);  }
        case 126: break;
        case 15: 
          {  return symbolFactory.newSymbol("eq",EQ);  }
        case 127: break;
        case 14: 
          {  return symbolFactory.newSymbol("gt",GT);  }
        case 128: break;
        case 35: 
          {  return symbolFactory.newSymbol("lt",LT);  }
        case 129: break;
        case 45: 
          {  return symbolFactory.newSymbol("go",GO);  }
        case 130: break;
        case 90: 
          {  return symbolFactory.newSymbol("explicit_radix_integer_literal", EXPLICIT_RADIX_INTEGER_LITERAL, toDecimalNumber(yytext()));  }
        case 131: break;
        case 43: 
          {  return symbolFactory.newSymbol("declare",DECLARE);  }
        case 132: break;
        case 46: 
          {  return symbolFactory.newSymbol("minuseq",MINUSEQ);  }
        case 133: break;
        case 51: 
          {  return symbolFactory.newSymbol("equalto",EQUALTO);  }
        case 134: break;
        case 122: 
          {  return symbolFactory.newSymbol("print",PRINT);  }
        case 135: break;
        case 121: 
          {  return symbolFactory.newSymbol("break",BREAK);  }
        case 136: break;
        case 120: 
          {  return symbolFactory.newSymbol("while",WHILE);  }
        case 137: break;
        case 105: 
          {  return symbolFactory.newSymbol("shleq",SHLEQ);  }
        case 138: break;
        case 88: 
          {  return symbolFactory.newSymbol("shreq",SHREQ);  }
        case 139: break;
        case 84: 
          {  return symbolFactory.newSymbol("remeq",REMEQ);  }
        case 140: break;
        case 83: 
          {  return symbolFactory.newSymbol("diveq",DIVEQ);  }
        case 141: break;
        case 81: 
          {  return symbolFactory.newSymbol("andeq",ANDEQ);  }
        case 142: break;
        case 76: 
          {  return symbolFactory.newSymbol("muleq",MULEQ);  }
        case 143: break;
        case 75: 
          {  return symbolFactory.newSymbol("xoreq",XOREQ);  }
        case 144: break;
        case 13: 
          {  return symbolFactory.newSymbol("minus",MINUS);  }
        case 145: break;
        case 11: 
          {  return symbolFactory.newSymbol("comma",COMMA);  }
        case 146: break;
        case 3: 
          {  return symbolFactory.newSymbol("colon",COLON);  }
        case 147: break;
        case 5: 
          {  return symbolFactory.newSymbol("lpran",LPRAN);  }
        case 148: break;
        case 6: 
          {  return symbolFactory.newSymbol("rpran",RPRAN);  }
        case 149: break;
        case 7: 
          {  return symbolFactory.newSymbol("begin",BEGIN);  }
        case 150: break;
        case 37: 
          {  return symbolFactory.newSymbol("bwand",BWAND);  }
        case 151: break;
        case 54: 
          {  return symbolFactory.newSymbol("pplus",PPLUS);  }
        case 152: break;
        case 2: 
        case 18: 
        case 32: 
          {  emit_warning("Unrecognized character '" +yytext()+"' -- ignored");  }
        case 153: break;
        case 106: 
          {  return symbolFactory.newSymbol("nil",NIL);  }
        case 154: break;
        case 104: 
          {  return symbolFactory.newSymbol("adt",ADT);  }
        case 155: break;
        case 101: 
          {  return symbolFactory.newSymbol("sys",SYS);  }
        case 156: break;
        case 99: 
          {  return symbolFactory.newSymbol("for",FOR);  }
        case 157: break;
        case 98: 
          {  return symbolFactory.newSymbol("int",INT);  }
        case 158: break;
        case 82: 
          {  return symbolFactory.newSymbol("and",AND);  }
        case 159: break;
        case 80: 
          {  return symbolFactory.newSymbol("neq",NEQ);  }
        case 160: break;
        case 79: 
          {  return symbolFactory.newSymbol("shl",SHL);  }
        case 161: break;
        case 77: 
          {  return symbolFactory.newSymbol("pow",POW);  }
        case 162: break;
        case 12: 
          {  return symbolFactory.newSymbol("dot",DOT);  }
        case 163: break;
        case 8: 
          {  return symbolFactory.newSymbol("end",END);  }
        case 164: break;
        case 33: 
          {  return symbolFactory.newSymbol("xor",XOR);  }
        case 165: break;
        case 34: 
          {  return symbolFactory.newSymbol("mul",MUL);  }
        case 166: break;
        case 36: 
          {  return symbolFactory.newSymbol("not",NOT);  }
        case 167: break;
        case 38: 
          {  return symbolFactory.newSymbol("div",DIV);  }
        case 168: break;
        case 39: 
          {  return symbolFactory.newSymbol("rem",REM);  }
        case 169: break;
        case 49: 
          {  return symbolFactory.newSymbol("shr",SHR);  }
        case 170: break;
        case 113: 
          {  return symbolFactory.newSymbol("else",ELSE);  }
        case 171: break;
        case 108: 
          {  return symbolFactory.newSymbol("real",REAL);  }
        case 172: break;
        case 78: 
          {  return symbolFactory.newSymbol("lteq",LTEQ);  }
        case 173: break;
        case 61: 
          {  return symbolFactory.newSymbol("oreq",OREQ);  }
        case 174: break;
        case 19: 
          {  return symbolFactory.newSymbol("plus",PLUS);  }
        case 175: break;
        case 4: 
          {  return symbolFactory.newSymbol("semi",SEMI);  }
        case 176: break;
        case 50: 
          {  return symbolFactory.newSymbol("gteq",GTEQ);  }
        case 177: break;
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
        case 30: 
        case 31: 
        case 40: 
        case 41: 
        case 60: 
        case 63: 
        case 64: 
        case 66: 
        case 67: 
        case 68: 
        case 69: 
        case 70: 
        case 71: 
        case 72: 
        case 85: 
        case 86: 
        case 93: 
        case 94: 
        case 96: 
        case 97: 
        case 100: 
        case 102: 
        case 103: 
        case 107: 
        case 109: 
        case 112: 
        case 114: 
        case 115: 
        case 116: 
        case 117: 
        case 118: 
        case 119: 
          {  return symbolFactory.newSymbol("identifier", IDENTIFIER, yytext());  }
        case 178: break;
        case 89: 
        case 92: 
        case 110: 
        case 111: 
          {  return symbolFactory.newSymbol("real_literal", REAL_LITERAL, new Double(Double.parseDouble(yytext())));  }
        case 179: break;
        case 124: 
          {  return symbolFactory.newSymbol("string",STRING);  }
        case 180: break;
        case 123: 
          {  return symbolFactory.newSymbol("return",RETURN);  }
        case 181: break;
        case 10: 
          {  return symbolFactory.newSymbol("cbrack",CBRACK);  }
        case 182: break;
        case 9: 
          {  return symbolFactory.newSymbol("obrack",OBRACK);  }
        case 183: break;
        case 42: 
          {  return symbolFactory.newSymbol("concat",CONCAT);  }
        case 184: break;
        case 44: 
          {  return symbolFactory.newSymbol("mminus",MMINUS);  }
        case 185: break;
        case 53: 
          {  return symbolFactory.newSymbol("pluseq",PLUSEQ);  }
        case 186: break;
        case 74: 
          { 	String s = "";
								for(int i=1; i<yylength()-1; i++){ s += yytext().charAt(i); }
								return symbolFactory.newSymbol("string_literal", STRING_LITERAL, s);
							 }
        case 187: break;
        case 20: 
        case 21: 
        case 47: 
        case 56: 
        case 62: 
        case 87: 
        case 95: 
          {  return symbolFactory.newSymbol("integer_literal", INTEGER_LITERAL, new Integer(Integer.parseInt(yytext())));  }
        case 188: break;
        case 16: 
        case 17: 
          {  }
        case 189: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
