//
//  ContentViewController.m
//  Inscriere
//
//  Created by Viorel Radu on 15/01/14.
//  Copyright (c) 2014 UPB. All rights reserved.
//

#import "ContentViewController.h"

@interface ContentViewController ()
@property (retain, nonatomic) IBOutlet UIWebView *webView;
@end


@implementation ContentViewController
@synthesize webView;
@synthesize resourceName;

-(id) init{
    self = [self initWithNibName:@"ContentViewController" bundle:[NSBundle mainBundle]];
      return self;
}

- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
    self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
    if (self) {
        // Custom initialization
        webView = [[UIWebView alloc]init];
        self.webView.delegate = self;
    }
    return self;
}

- (void)viewDidLoad
{
    [super viewDidLoad];
    // Do any additional setup after loading the view from its nib.
    self.webView.delegate = self;
     [webView loadRequest:[NSURLRequest requestWithURL:[NSURL fileURLWithPath:[[NSBundle mainBundle] pathForResource:resourceName ofType:@"htm"]isDirectory:NO]]];
}

-(void)viewWillAppear{
   
    
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

-(void) webViewDidStartLoad:(UIWebView *)webView{
    NSLog(@"WebView start load");
}

-(void) webViewDidFinishLoad:(UIWebView *)webView{
    NSLog(@"WebView did finish load");
}
-(void) webView:(UIWebView *)webView didFailLoadWithError:(NSError *)error{
    //NSLog([error description]);
}
@end
